/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jgroups.raft;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JGroupsRaftComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "raftHandle": ((JGroupsRaftComponent) target).setRaftHandle(property(camelContext, org.jgroups.raft.RaftHandle.class, value)); return true;
        case "stateMachine": ((JGroupsRaftComponent) target).setStateMachine(property(camelContext, org.jgroups.protocols.raft.StateMachine.class, value)); return true;
        case "raftId": ((JGroupsRaftComponent) target).setRaftId(property(camelContext, java.lang.String.class, value)); return true;
        case "channelProperties": ((JGroupsRaftComponent) target).setChannelProperties(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((JGroupsRaftComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((JGroupsRaftComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((JGroupsRaftComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "rafthandle": ((JGroupsRaftComponent) target).setRaftHandle(property(camelContext, org.jgroups.raft.RaftHandle.class, value)); return true;
        case "statemachine": ((JGroupsRaftComponent) target).setStateMachine(property(camelContext, org.jgroups.protocols.raft.StateMachine.class, value)); return true;
        case "raftid": ((JGroupsRaftComponent) target).setRaftId(property(camelContext, java.lang.String.class, value)); return true;
        case "channelproperties": ((JGroupsRaftComponent) target).setChannelProperties(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((JGroupsRaftComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((JGroupsRaftComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((JGroupsRaftComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
