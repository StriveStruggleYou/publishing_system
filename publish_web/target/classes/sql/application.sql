CREATE TABLE `application` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `app_name` varchar(100) DEFAULT NULL,
  `app_desc` varchar(100) DEFAULT NULL,
  `app_port` int(11) DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  `project_name` varchar(100) DEFAULT NULL COMMENT 'git项目地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;