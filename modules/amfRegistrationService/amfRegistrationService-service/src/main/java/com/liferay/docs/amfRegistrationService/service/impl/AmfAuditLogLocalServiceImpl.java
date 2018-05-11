/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.amfRegistrationService.service.impl;

import com.liferay.docs.amfRegistrationService.dto.AmfAuditLogDTO;
import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;
import com.liferay.docs.amfRegistrationService.service.base.AmfAuditLogLocalServiceBaseImpl;

/**
 * The implementation of the amf audit log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalServiceUtil
 */
public class AmfAuditLogLocalServiceImpl extends AmfAuditLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalServiceUtil} to access the amf audit log local service.
	 */

	public void addAuditLogEvent(AmfAuditLogDTO amfAuditLogDTO){
		AmfAuditLog amfAuditLog = amfAuditLogPersistence.create(0);

		amfAuditLog.setUserId(amfAuditLogDTO.getUserId());
		amfAuditLog.setUserName(amfAuditLogDTO.getUserName());
		amfAuditLog.setIpAddress(amfAuditLogDTO.getIpAddress());
		amfAuditLog.setDateTime(amfAuditLogDTO.getDateTime());
		amfAuditLog.setEventType(amfAuditLogDTO.getEventType());

		amfAuditLogPersistence.update(amfAuditLog);
	}
}