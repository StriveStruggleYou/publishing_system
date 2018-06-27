#!/bin/bash

#1.shell判断文件,目录是否存在或者具有权限
folder="/home/admin/packing"
# -x 参数判断 $folder 是否存在并且是否具有可执行权限
if [ ! -x "$folder"]; then
  mkdir "$folder"
fi

#2.执行git 命令 如果 不存在就下载
