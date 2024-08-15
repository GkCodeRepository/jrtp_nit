package com.gk.api;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gk.service.NotificationClient;

/*@Controller
@ResponseBody*/
@RestController //@Controller + @ResponseBody
@RequestMapping("notifications")
public class NotificaionAPI {
	
	@Autowired
	private NotificationClient notificationClient;
	
	@GetMapping("/email")
	public String triggerNotification() {
		return this.notificationClient.sendNotification();
	}
}
