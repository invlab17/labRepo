package com.innovationlab.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.innovationlab.model.Account;

public interface AccountClient {
	
	@RequestMapping(value = "/{id}/accounts",method = RequestMethod.GET)
	List<Account> getAccounts(@PathVariable String id);
	
}
