package org.springframework.social.partnercenter.api.order.offer;

import java.util.List;
import java.util.Map;

import org.springframework.social.partnercenter.api.Link;
import org.springframework.social.partnercenter.api.order.Product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Offer {
	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("minimumQuantity")
	private int minimumQuantity;
	@JsonProperty("maximumQuantity")
	private double maximumQuantity;
	@JsonProperty("rank")
	private int rank;
	@JsonProperty("uri")
	private String uri;
	@JsonProperty("locale")
	private String locale;
	@JsonProperty("country")
	private String country;
	@JsonProperty("category")
	private OfferCategory category;
	@JsonProperty("prerequisiteOffers")
	private List<String> prerequisiteOffers;
	@JsonProperty("isAddOn")
	private boolean isAddOn;
	@JsonProperty("hasAddOns")
	private boolean hasAddOns;
	@JsonProperty("isAvailableForPurchase")
	private boolean isAvailableForPurchase;
	@JsonProperty("billing")
	private String billing;
	@JsonProperty("isAutoRenewable")
	private boolean isAutoRenewable;
	@JsonProperty("product")
	private Product product;
	@JsonProperty("unitType")
	private String unitType;
	@JsonProperty("links")
	private Map<String, Link> links;
	@JsonProperty("attributes")
	private Map<String, String> attributes;

	public String getId() {
		return id;
	}

	public Offer setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Offer setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Offer setDescription(String description) {
		this.description = description;
		return this;
	}

	public int getMinimumQuantity() {
		return minimumQuantity;
	}

	public Offer setMinimumQuantity(int minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
		return this;
	}

	public double getMaximumQuantity() {
		return maximumQuantity;
	}

	public Offer setMaximumQuantity(double maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
		return this;
	}

	public int getRank() {
		return rank;
	}

	public Offer setRank(int rank) {
		this.rank = rank;
		return this;
	}

	public String getUri() {
		return uri;
	}

	public Offer setUri(String uri) {
		this.uri = uri;
		return this;
	}

	public String getLocale() {
		return locale;
	}

	public Offer setLocale(String locale) {
		this.locale = locale;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public Offer setCountry(String country) {
		this.country = country;
		return this;
	}

	public OfferCategory getCategory() {
		return category;
	}

	public Offer setCategory(OfferCategory category) {
		this.category = category;
		return this;
	}

	public List<String> getPrerequisiteOffers() {
		return prerequisiteOffers;
	}

	public Offer setPrerequisiteOffers(List<String> prerequisiteOffers) {
		this.prerequisiteOffers = prerequisiteOffers;
		return this;
	}

	public boolean isAddOn() {
		return isAddOn;
	}

	public Offer setAddOn(boolean addOn) {
		isAddOn = addOn;
		return this;
	}

	public boolean isHasAddOns() {
		return hasAddOns;
	}

	public Offer setHasAddOns(boolean hasAddOns) {
		this.hasAddOns = hasAddOns;
		return this;
	}

	public boolean isAvailableForPurchase() {
		return isAvailableForPurchase;
	}

	public Offer setAvailableForPurchase(boolean availableForPurchase) {
		isAvailableForPurchase = availableForPurchase;
		return this;
	}

	public String getBilling() {
		return billing;
	}

	public Offer setBilling(String billing) {
		this.billing = billing;
		return this;
	}

	public boolean isAutoRenewable() {
		return isAutoRenewable;
	}

	public Offer setAutoRenewable(boolean autoRenewable) {
		isAutoRenewable = autoRenewable;
		return this;
	}

	public Product getProduct() {
		return product;
	}

	public Offer setProduct(Product product) {
		this.product = product;
		return this;
	}

	public String getUnitType() {
		return unitType;
	}

	public Offer setUnitType(String unitType) {
		this.unitType = unitType;
		return this;
	}

	public Map<String, Link> getLinks() {
		return links;
	}

	public Offer setLinks(Map<String, Link> links) {
		this.links = links;
		return this;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public Offer setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}
}
