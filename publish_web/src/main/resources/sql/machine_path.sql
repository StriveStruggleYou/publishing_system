CREATE TABLE `machine_path` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ms_path_name` varchar(100) DEFAULT NULL COMMENT '路径key',
  `ms_path` varchar(500) DEFAULT NULL COMMENT '机器实际路径',
  `ms_desc` varchar(100) DEFAULT NULL COMMENT '路径描述',
  `ms_type` int(4) DEFAULT NULL COMMENT '属于哪种机器类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `machine_path` (`id`, `ms_path_name`, `ms_path`, `ms_desc`, `ms_type`)
VALUES
	(1, 'package_path', '/home/admin/packing', '打包机器统一打包路径', 1),
	(2, 'publish_path', '/home/admin/publish', '发布机器统一发布路径', 2),
	(3, 'storage_path', '/home/admin/storage', '存储机器统一存储路径', 3);








