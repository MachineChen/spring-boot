package org.springframework.boot.chenxun;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: chenxun
 * @date: 2020/4/3
 * @time: 1:41 上午
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */

@Controller
@RequestMapping(value = "/web", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ResponseBody
public class WebController {

	@GetMapping(value = "/test")
	public List test() {
		List list = new ArrayList();
		list.add("调试了两天，终于通了。。。感动哭");
		return list;
	}
}
