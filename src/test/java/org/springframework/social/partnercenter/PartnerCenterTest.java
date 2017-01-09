package org.springframework.social.partnercenter;

import org.junit.Test;
import org.springframework.social.partnercenter.api.order.response.OfferListResponse;
import org.springframework.social.partnercenter.connect.PartnerCenterConnectionFactory;
import org.springframework.social.partnercenter.http.logging.LogLevel;
import org.springframework.social.partnercenter.serialization.Json;

public class PartnerCenterTest {

	@Test
	public void someTest(){
		PartnerCenterConnectionFactory factory = new PartnerCenterConnectionFactory("9193d755-e3fe-4510-a954-e1f5046fbab0",
				"DTW10c2hW8hllL5vqV8Pd2omzBKhWMmmaNQP1rcgiuw=",
				"testtestappdirecttip.onmicrosoft.com");
		PartnerCenter partnerCenter = factory.createConnection().getApi();
//		CustomerOperations customerOperations = partnerCenter.getCustomerOperations();
//		PartnerCenterResponse<Customer> list = customerOperations.getList(100);
//		PartnerCenterResponse<Order> aCustomersOrder = partnerCenter.getOrderOperations().getACustomersOrder(list.getItems().get(1).getId());
//		GetCompanyProfileResponse customersCompanyProfile = partnerCenter.getCustomerOperations().getCustomersCompanyProfile(list.getItems().get(1).getId());
//		Customer customer = list.getItems().get(1);
//		PartnerCenterResponse<Invoice> invoices = partnerCenter.getInvoiceOperations().getInvoices();
//		Boolean domainAvailable = partnerCenter.getUtilityOperations().isDomainAvailable("oozieconsole");
//		CountryInformation us = partnerCenter.getUtilityOperations().getAddressFormattingRulesByMarket("us");
//		CustomerUsageSummary usageSummary = partnerCenter.getUsageOperations().getUsageSummary(customer.getId());
//		GetSubscriptionListResponse customersSubscriptions = partnerCenter.getSubscriptionOperations().getCustomersSubscriptions(customer.getId());
		partnerCenter.enableSlf4j(LogLevel.INFO);
		OfferListResponse addOnOffersForOffer = partnerCenter.getOfferOperations()
				.getAddOnOffersForOffer("1E51E973-0BB4-4358-8202-C417F8239BC0", "US");
		System.out.println(Json.toJson(addOnOffersForOffer.getItems()));
	}
}
