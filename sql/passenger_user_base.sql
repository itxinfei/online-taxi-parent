/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : online-taxi-three

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 28/08/2020 22:36:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for passenger_user_base
-- ----------------------------
DROP TABLE IF EXISTS `passenger_user_base`;
CREATE TABLE `passenger_user_base`  (
  `id` bigint(18) NOT NULL COMMENT '主键',
  `login_name` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '登陆名（默认为手机号）',
  `password` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码（不一定存在）',
  `nick_name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `gender` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '0' COMMENT '性别 0：未知 1：男 2：女',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '手机号码',
  `email` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱地址',
  `register_date` datetime(0) NULL DEFAULT NULL COMMENT '注册成功的时间',
  `lock_flag` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '允许登陆标识 0：不允许 1：允许',
  `create_date` datetime(0) NOT NULL COMMENT '创建时间',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `create_user_id` bigint(18) NOT NULL COMMENT '创建人ID',
  `update_user_id` bigint(18) NULL DEFAULT NULL COMMENT '更新人ID',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `index_passenger_user_login_name`(`login_name`) USING BTREE,
  UNIQUE INDEX `index_passenger_user_phone`(`phone`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
