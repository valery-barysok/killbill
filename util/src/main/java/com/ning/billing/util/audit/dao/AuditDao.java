/*
 * Copyright 2010-2012 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.util.audit.dao;

import java.util.List;
import java.util.UUID;

import com.ning.billing.callcontext.InternalTenantContext;
import com.ning.billing.util.api.AuditLevel;
import com.ning.billing.util.audit.AuditLog;
import com.ning.billing.util.audit.DefaultAccountAuditLogs;
import com.ning.billing.util.audit.DefaultAccountAuditLogsForObjectType;
import com.ning.billing.util.dao.TableName;

public interface AuditDao {

    // Make sure to consume all or call close() when done for release the connection
    public DefaultAccountAuditLogs getAuditLogsForAccountRecordId(AuditLevel auditLevel, InternalTenantContext context);

    // Make sure to consume all or call close() when done for release the connection
    public DefaultAccountAuditLogsForObjectType getAuditLogsForAccountRecordId(TableName tableName, AuditLevel auditLevel, InternalTenantContext context);

    public List<AuditLog> getAuditLogsForId(TableName tableName, UUID objectId, AuditLevel auditLevel, InternalTenantContext context);
}
