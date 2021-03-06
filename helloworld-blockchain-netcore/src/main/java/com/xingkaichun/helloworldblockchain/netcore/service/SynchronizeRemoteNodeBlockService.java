package com.xingkaichun.helloworldblockchain.netcore.service;

import com.xingkaichun.helloworldblockchain.netcore.dto.netserver.NodeDto;

/**
 * 同步节点数据service
 *
 * @author 邢开春 微信HelloworldBlockchain 邮箱xingkaichun@qq.com
 */
public interface SynchronizeRemoteNodeBlockService {

    /**
     * 同步远程节点的区块到本地区块链系统
     */
    void synchronizeRemoteNodeBlock(NodeDto node) ;
}
