package cn.wy.cluster1;

/**
 * 集群启动.
 * 配置参数在 zookeeper/conf/cluster1 下.
 * 新建3个 QuorumPeerMain 的configuration: QuorumPeerMain1, QuorumPeerMain2, QuorumPeerMain3, program arguments分别是:
 * /home/leslie/myprojects/GitHub/zookeeper/conf/cluster1/zoo1/zoo.cfg,
 * /home/leslie/myprojects/GitHub/zookeeper/conf/cluster1/zoo2/zoo.cfg,
 * /home/leslie/myprojects/GitHub/zookeeper/conf/cluster1/zoo3/zoo.cfg
 * 分别启动3个zookeeper即可.
 */
public class Cluster1 {
}
