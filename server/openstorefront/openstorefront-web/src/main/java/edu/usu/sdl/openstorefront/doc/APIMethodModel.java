/*
 * Copyright 2014 Space Dynamics Laboratory - Utah State University Research Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.usu.sdl.openstorefront.doc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dshurtleff
 */
public class APIMethodModel
{
	private List<APIParamModel> methodParams = new ArrayList<>();
	private String methodPath;
	private String returnObject;
	private String description;
	private boolean requireAdmin;

	public APIMethodModel()
	{
	}

	public String getMethodPath()
	{
		return methodPath;
	}

	public void setMethodPath(String methodPath)
	{
		this.methodPath = methodPath;
	}

	public String getReturnObject()
	{
		return returnObject;
	}

	public void setReturnObject(String returnObject)
	{
		this.returnObject = returnObject;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public List<APIParamModel> getMethodParams()
	{
		return methodParams;
	}

	public void setMethodParams(List<APIParamModel> methodParams)
	{
		this.methodParams = methodParams;
	}

	public boolean isRequireAdmin()
	{
		return requireAdmin;
	}

	public void setRequireAdmin(boolean requireAdmin)
	{
		this.requireAdmin = requireAdmin;
	}
	
	
	
}
