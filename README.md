# SpringCloudConfig
博客地址：https://blog.csdn.net/xinanrusu/article/details/86650506



现在的代码是支持秘钥加密的，生成秘钥的方式：

一： 下载和安装加密需要的oracle jce 包

1.找到$JAVA_HOME/jre/lib/security目录，将local_policy.jar和US_export_policy.jar  备份。
2.下载jce,因为我是jdk8所以下载地址为：https://www.oracle.com/technetwork/java/javase/downloads/jce-6-download-429243.html
3.将新下载的jce包中local_policy.jar和US_export_policy.jar拷贝到$JAVA_HOME/jre/lib/security目录。


二：生成秘钥：
使用jdk自带的keytool工具生成秘钥：
keytool -genkeypair  -alias myusecurity -keyalg RSA  -keypass password -sigalg SHA256withRSA -dname "cn=gx,ou=si,o=unicom.si,l=Beijing,st=Beijing,c=CN" -validity 3650 -keystore myuKeyStore.jks -storetype JKS -storepass password

三：将生成的秘钥粘贴到src/main/resources下

