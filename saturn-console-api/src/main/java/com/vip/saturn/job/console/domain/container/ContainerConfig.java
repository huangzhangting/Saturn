/**
 * Copyright 2016 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 *  the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * </p>
 **/

package com.vip.saturn.job.console.domain.container;

import java.util.List;
import java.util.Map;

/**
 * @author hebelala
 */
public class ContainerConfig {

	private String taskId;
	private String cmd;
	private Float cpus;
	private Float mem;
	private Integer instances;
	private List<List<String>> constraints;
	private Map<String, String> env;
	private Boolean privileged;
	private Boolean forcePullImage;
	private List<Map<String, String>> parameters;
	private List<Map<String, String>> volumes;
	private String image;
	private Long createTime;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Float getCpus() {
		return cpus;
	}

	public void setCpus(Float cpus) {
		this.cpus = cpus;
	}

	public Float getMem() {
		return mem;
	}

	public void setMem(Float mem) {
		this.mem = mem;
	}

	public Integer getInstances() {
		return instances;
	}

	public void setInstances(Integer instances) {
		this.instances = instances;
	}

	public List<List<String>> getConstraints() {
		return constraints;
	}

	public void setConstraints(List<List<String>> constraints) {
		this.constraints = constraints;
	}

	public Map<String, String> getEnv() {
		return env;
	}

	public void setEnv(Map<String, String> env) {
		this.env = env;
	}

	public Boolean getPrivileged() {
		return privileged;
	}

	public void setPrivileged(Boolean privileged) {
		this.privileged = privileged;
	}

	public Boolean getForcePullImage() {
		return forcePullImage;
	}

	public void setForcePullImage(Boolean forcePullImage) {
		this.forcePullImage = forcePullImage;
	}

	public List<Map<String, String>> getParameters() {
		return parameters;
	}

	public void setParameters(List<Map<String, String>> parameters) {
		this.parameters = parameters;
	}

	public List<Map<String, String>> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<Map<String, String>> volumes) {
		this.volumes = volumes;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
}
