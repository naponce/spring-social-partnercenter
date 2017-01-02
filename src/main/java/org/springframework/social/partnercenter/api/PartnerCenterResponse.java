package org.springframework.social.partnercenter.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartnerCenterResponse<T> {
	@JsonProperty("totalCount")
	private int total;
	@JsonProperty
	private List<T> items;
	@JsonProperty
	private Map<String, String> attributes;
	@JsonProperty
	private Map<String, String> links = new HashMap<>();

	public int getTotal() {
		return total;
	}

	public PartnerCenterResponse setTotal(int total) {
		this.total = total;
		return this;
	}

	public List<T> getItems() {
		return items;
	}

	public PartnerCenterResponse setItems(List<T> items) {
		this.items = items;
		return this;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public PartnerCenterResponse setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}

	public Map<String, String> getLinks() {
		return links;
	}

	public PartnerCenterResponse setLinks(Map<String, String> links) {
		this.links = links;
		return this;
	}
}
