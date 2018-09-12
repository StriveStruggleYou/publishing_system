#查看所有共有key的列表
cat /home/admin/.ssh/authorized_keys


#添加共有的秘钥
echo rsaPub >> /home/admin/.ssh/authorized_keys

#删除指定的秘钥数据
sed -i '/" + sb.toString() + "/d' /home/admin/.ssh/authorized_keys

#也可以根据行进行删除
sed -i '1d' /home/admin/.ssh/authorized_keys


