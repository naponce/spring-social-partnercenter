package org.springframework.social.partnercenter.api.billing.pricing;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class AzureResourcePricing {
	private Locale locale;
	private String currency;
	private boolean isTaxIncluded;
	private List<PricingMeter> meters;
	private List<OfferTerm> offerTerms;
	private Map<String, String> attributes;

	@JsonIgnore
	public Locale getLocale() {
		return locale;
	}

	@JsonIgnore
	public AzureResourcePricing setLocale(Locale locale) {
		this.locale = locale;
		return this;
	}

	@JsonProperty("locale")
	@JsonCreator
	public void localeFromLanguageTag(String locale) {
		this.locale = Locale.forLanguageTag(locale);
	}

	@JsonValue
	public String localeToLaguageTag() {
		return this.locale.toLanguageTag();
	}

	public String getCurrency() {
		return currency;
	}

	public AzureResourcePricing setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	public boolean isTaxIncluded() {
		return isTaxIncluded;
	}

	public AzureResourcePricing setTaxIncluded(boolean taxIncluded) {
		isTaxIncluded = taxIncluded;
		return this;
	}

	public List<PricingMeter> getMeters() {
		return meters;
	}

	public AzureResourcePricing setMeters(List<PricingMeter> meters) {
		this.meters = meters;
		return this;
	}

	public List<OfferTerm> getOfferTerms() {
		return offerTerms;
	}

	public AzureResourcePricing setOfferTerms(List<OfferTerm> offerTerms) {
		this.offerTerms = offerTerms;
		return this;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public AzureResourcePricing setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
		return this;
	}
}
