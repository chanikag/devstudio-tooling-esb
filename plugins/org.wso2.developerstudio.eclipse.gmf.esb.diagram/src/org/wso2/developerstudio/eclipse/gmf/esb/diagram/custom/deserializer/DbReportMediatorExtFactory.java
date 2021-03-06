/*
*  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.synapse.Mediator;
import org.apache.synapse.config.xml.DBReportMediatorFactory;
import org.apache.synapse.mediators.db.DBReportMediator;

public class DbReportMediatorExtFactory extends DBReportMediatorFactory {
    
    private static DbReportMediatorExtFactory instance;
    
    private DbReportMediatorExtFactory() {
    }
    
    public static synchronized DbReportMediatorExtFactory getInstance() {
        if (instance == null) {
            instance = new DbReportMediatorExtFactory();
        }
        return instance;
    }

    protected Mediator createSpecificMediator(OMElement omElement) {

        Mediator mediator = new DBReportMediator();
        QName DBREPORT_USE_TX = new QName("useTransaction");

        processAuditStatus(mediator, omElement);

        OMAttribute useTx = omElement.getAttribute(DBREPORT_USE_TX);
        if (useTx != null && useTx.getAttributeValue() != null) {
            String useTxValue = useTx.getAttributeValue();
            if (useTxValue.equals("true")) {
                ((DBReportMediator) mediator).setUseTransaction(true);
            } else {
                ((DBReportMediator) mediator).setUseTransaction(false);
            }
        }
        buildDataSource(omElement, (DBReportMediator) mediator);
        processStatements(omElement, (DBReportMediator) mediator);
        
        addAllCommentChildrenToList(omElement, ((DBReportMediator) mediator).getCommentsList());

        return mediator;

    }

}
