/*
*
* Copyright 2013 Entando S.r.l. (http://www.entando.com) All rights reserved.
*
* This file is part of Entando software. 
* Entando is a free software; 
* You can redistribute it and/or modify it
* under the terms of the GNU General Public License (GPL) as published by the Free Software Foundation; version 2.
* 
* See the file License for the specific language governing permissions   
* and limitations under the License
* 
* 
* 
* Copyright 2013 Entando S.r.l. (http://www.entando.com) All rights reserved.
*
*/
package org.entando.entando.plugins.jpsolrclient.aps.system.services.content;

import java.util.Date;

public class LastReloadInfo extends com.agiletec.plugins.jacms.aps.system.services.searchengine.LastReloadInfo {
	
	@Override
	protected void setDate(Date date) {
		super.setDate(date);
	}
	
	@Override
	protected void setResult(int result) {
		super.setResult(result);
	}
	
}