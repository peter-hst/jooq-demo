/*
 Navicat Premium Data Transfer

 Source Server         : local-dev
 Source Server Type    : MySQL
 Source Server Version : 50709
 Source Host           : localhost:3306
 Source Schema         : rbca

 Target Server Type    : MySQL
 Target Server Version : 50709
 File Encoding         : 65001

 Date: 30/09/2019 14:32:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fnd_user
-- ----------------------------
DROP TABLE IF EXISTS `fnd_user`;
CREATE TABLE `fnd_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `created_time` datetime(0) DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updated_time` datetime(0) DEFAULT NULL COMMENT '修改时间',
  `price` decimal(16, 2) DEFAULT NULL COMMENT '货币类型',
  `summary` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '简述',
  `intro` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '介绍',
  `lng` decimal(20, 15) DEFAULT NULL COMMENT '经度',
  `lat` decimal(24, 20) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fnd_user
-- ----------------------------
INSERT INTO `fnd_user` VALUES (1, 'peter', 50, '2019-09-30 10:27:57', '2019-09-30 10:28:15', 3.68, '士大夫大师傅似的的是法国大使馆', '儿童如果他hi old肉体和突然间巨化股份v我格尔海瑞oil部分v打算试试能否附件，名叫换行符v', 120.234345000000000, 30.43534000000000000000);
INSERT INTO `fnd_user` VALUES (2, 'kate', 16, '2019-09-30 10:28:33', '2019-09-30 10:28:37', 19898.99, '额我热我热温热为特瑞特让他', '的个人推荐咯iu就天天天太热v黄家驹iu裤脚用户提供人非常反感肥牛美女吧v从， 发生变更台式机儿童保护特疼二姨家朋友家里浮点数的房间里是瑞典和认同人', 121.468798900000000, 30.56565400000000000000);

SET FOREIGN_KEY_CHECKS = 1;
