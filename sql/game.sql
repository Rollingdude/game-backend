/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : 127.0.0.1:3306
 Source Schema         : game

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 29/10/2023 18:24:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_character_part
-- ----------------------------
DROP TABLE IF EXISTS `tb_character_part`;
CREATE TABLE `tb_character_part`  (
  `id` int NOT NULL,
  `item_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `item_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `apply_type` tinyint NULL DEFAULT NULL,
  `skeletal_mesh_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` bigint NULL DEFAULT NULL,
  `update_time` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_character_part
-- ----------------------------

-- ----------------------------
-- Table structure for tb_item_template
-- ----------------------------
DROP TABLE IF EXISTS `tb_item_template`;
CREATE TABLE `tb_item_template`  (
  `id` int NOT NULL COMMENT '主键',
  `item_name` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `alias` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `item_type` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mesh_type` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `anim_data_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `static_mesh_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `skeletal_mesh_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `avatar_actor_class_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `anim_class_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `icon_assets_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` bigint NOT NULL,
  `update_time` bigint NOT NULL,
  `states` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_item_template
-- ----------------------------

-- ----------------------------
-- Table structure for tb_player
-- ----------------------------
DROP TABLE IF EXISTS `tb_player`;
CREATE TABLE `tb_player`  (
  `id` int NOT NULL DEFAULT 0,
  `nickname` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `level` int NOT NULL DEFAULT 1,
  `personal_signature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `platform` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `preferred_loadout_index` tinyint(1) NULL DEFAULT NULL,
  `platform_nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `states` tinyint(1) NULL DEFAULT NULL,
  `create_time` bigint NULL DEFAULT NULL,
  `update_time` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_player
-- ----------------------------
INSERT INTO `tb_player` VALUES (1, 'Mactavisher', '1591815294', 1, 'test singnarue', 'test', 'steam', NULL, 'mactavisher', 1, NULL, NULL);

-- ----------------------------
-- Table structure for tb_player_loadout
-- ----------------------------
DROP TABLE IF EXISTS `tb_player_loadout`;
CREATE TABLE `tb_player_loadout`  (
  `id` bigint NOT NULL COMMENT '主键',
  `player_id` bigint NOT NULL COMMENT '玩家id',
  `content` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设置内容',
  `loadout_index` tinyint NOT NULL,
  `name` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `states` tinyint(1) NOT NULL DEFAULT 1,
  `create_time` bigint NULL DEFAULT NULL,
  `update_time` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `inx_user_id`(`player_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_player_loadout
-- ----------------------------
INSERT INTO `tb_player_loadout` VALUES (1, 1, '{\"LoadoutSlots\":{\"0\":{\"LoadoutName\":\"None\",\"PrimaryWeaponSetting\":[{\"ItemId\":18,\"WeaponPartSettings\":[],\"WeaponAttachmentSettings\":[],\"bDirty\":false}],\"SecondaryWeaponSetting\":[{\"ItemId\":18,\"WeaponPartSettings\":[],\"WeaponAttachmentSettings\":[],\"bDirty\":false}],\"ThrowableWeapons\":[],\"ColdWeapon\":{\"ItemId\":0,\"WeaponPartSettings\":[],\"WeaponAttachmentSettings\":[],\"bDirty\":false}}},\"CurrentSelectedSlot\":0,\"bValidData\":false}', 0, 'default', 1, NULL, NULL);

-- ----------------------------
-- Table structure for tb_weapon
-- ----------------------------
DROP TABLE IF EXISTS `tb_weapon`;
CREATE TABLE `tb_weapon`  (
  `id` int NOT NULL COMMENT '主键',
  `item_name` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `alias` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `item_type` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mesh_type` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `anim_data_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `static_mesh_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `skeletal_mesh_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `avatar_actor_class_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `anim_class_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `weapon_category` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `concrete` tinyint NOT NULL DEFAULT 0,
  `base_clip_capacity` int NOT NULL DEFAULT 30,
  `base_clip_size` int NOT NULL DEFAULT 5,
  `max_ammo` int NOT NULL DEFAULT 150,
  `time_between_shots` float NOT NULL,
  `ads_in_time` float NOT NULL,
  `ads_out_time` float NULL DEFAULT NULL,
  `base_ads_fov` float NULL DEFAULT NULL,
  `base_damage` float NULL DEFAULT NULL,
  `muzzle_speed` float NULL DEFAULT NULL,
  `scan_trace_range` float NULL DEFAULT NULL,
  `semi_burst_count` int NULL DEFAULT NULL,
  `semi_burst_interval` float NULL DEFAULT NULL,
  `bullet_per_cartridge` int NULL DEFAULT 1,
  `projectile_damage_multiplier` float NULL DEFAULT NULL,
  `require_optic_rail` tinyint(1) NULL DEFAULT NULL,
  `priority` tinyint NULL DEFAULT NULL,
  `available_fire_modes` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `available_reload_types` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `default_weapon_part_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `projectile_class_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `icon_assets_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `weapon_effects_assets_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `base_recoil_horizontal_factor` float NULL DEFAULT NULL,
  `base_recoil_vertical_factor` float NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` bigint NOT NULL,
  `update_time` bigint NOT NULL,
  `states` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_weapon
-- ----------------------------
INSERT INTO `tb_weapon` VALUES (18, 'NSLOCTEXT(\\\"[E25C7490AF9727295C4AEC64CD9E178A]\\\", \\\"ADD71B68458C139BC7BAC2A0B3BDEB78\\\", \\\"M4A1 Carbin\\\")', 'm4a1', 'WEAPON', 'Skeletal', '/Game/Blueprints/Items/Weapons/Rifles/M4A1/DA_ANIM_M4A1.DA_ANIM_M4A1', 'test', 'test', '/Script/Insurgency.WeaponAvatarActor', '/Game/Blueprints/Items/Weapons/Rifles/M4A1/ABP_M4A11.ABP_M4A11_C', 'AR', 0, 30, 5, 150, 0.09, 0.5, 0.5, 85, 25, 80000, 40000, 3, 0.08, 1, 1.5, 1, 1, '[\"FULLAUTO\",\"SEMIAUTO\",\"SINGLE\"]', '[\"ONCE\"]', '/Game/Blueprints/Items/Weapons/Rifles/M4A1Carbin/DA_M4A1_default_part.DA_M4A1_default_part', NULL, NULL, '/Game/Blueprints/Items/Weapons/Rifles/M4A1/DA_M4A1_Effects.DA_M4A1_Effects', NULL, NULL, NULL, 1000, 1000, 1);

-- ----------------------------
-- Table structure for tb_weapon_part
-- ----------------------------
DROP TABLE IF EXISTS `tb_weapon_part`;
CREATE TABLE `tb_weapon_part`  (
  `id` int NOT NULL COMMENT '主键',
  `item_name` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `alias` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `item_type` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mesh_type` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `anim_data_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `static_mesh_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `skeletal_mesh_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `avatar_actor_class_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `anim_class_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `dedicated_weapon_id` int NULL DEFAULT NULL,
  `attach_parent_socket_name` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `weapon_part_type` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `compatible_weapons` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `socket_type_and_names` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `icon_assets_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` bigint NOT NULL,
  `update_time` bigint NOT NULL,
  `states` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_weapon_part
-- ----------------------------
INSERT INTO `tb_weapon_part` VALUES (1000, 'NSLOCTEXT(\\\"[243DFD8ECCBE4F6C323C7169318D73FB]\\\", \\\"60B4D95F4A5CE052CE7C00A59476F4A3\\\", \\\"M4A1Carbin Receiver\\\")', NULL, 'WEAPON_PART', 'Skeletal', NULL, NULL, '/Game/Art/Animated/Items/Weapons/Rifles/M4A1Carbin/SKEL_M4A1_Carbin.SKEL_M4A1_Carbin', NULL, NULL, NULL, NULL, NULL, NULL, '{\"BARREL\":\"BarrelSocket\",\"STOCK\":\"StockSocket\",\"HAND_GUARD\":\"RailSocket\"}', NULL, NULL, 1, 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
