/*
 * (C) Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     ohun@live.cn (夜色)
 */

package com.mpush.handler;

import com.mpush.api.Logger;
import com.mpush.api.connection.Connection;
import com.mpush.api.protocol.Packet;
import com.mpush.client.ClientConfig;
import com.mpush.client.AckRequestMgr;
import com.mpush.message.AckMessage;

/**
 * Created by ohun on 16/9/5.
 *
 * @author ohun@live.cn (夜色)
 */
public class AckHandler extends BaseMessageHandler<AckMessage> {

    private final Logger logger;
    private final AckRequestMgr ackRequestMgr;

    public AckHandler() {
        this.logger = ClientConfig.I.getLogger();
        this.ackRequestMgr = AckRequestMgr.I();
    }

    @Override
    public AckMessage decode(Packet packet, Connection connection) {
        return new AckMessage(packet, connection);
    }

    @Override
    public void handle(AckMessage message) {
        /*AckRequestMgr.RequestTask task = ackRequestMgr.getAndRemove(message.getSessionId());
        if (task != null) {
            task.success(message.getPacket());
        }*/
    }
}
