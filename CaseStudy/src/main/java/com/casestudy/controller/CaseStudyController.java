package com.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.service.CaseStudyService;

@RestController
@RequestMapping("/products")
public class CaseStudyController {

	@Autowired
	private CaseStudyService caseStudyService;

	@PostMapping("_get/brand")
	@ResponseBody
	public ResponseEntity<?> getBrand() {
		return new ResponseEntity<>(caseStudyService.searchBrand(), HttpStatus.OK);
	}

	@PostMapping("_get/price")
	@ResponseBody
	public ResponseEntity<?> getPrice() {
		return new ResponseEntity<>(caseStudyService.searchPrice(), HttpStatus.OK);
	}

	@PostMapping("_get/color")
	@ResponseBody
	public ResponseEntity<?> getColor() {
		return new ResponseEntity<>(caseStudyService.searchColor(), HttpStatus.OK);
	}

	@PostMapping("_get/size")
	@ResponseBody
	public ResponseEntity<?> getSize() {
		return new ResponseEntity<>(caseStudyService.searchSize(), HttpStatus.OK);
	}

	@PostMapping("_get/sku")
	@ResponseBody
	public ResponseEntity<?> getSku() {
		return new ResponseEntity<>(caseStudyService.searchSku(), HttpStatus.OK);
	}

	@PostMapping("_get/availproductbyseller")
	@ResponseBody
	public ResponseEntity<?> getAvailproductbyseller() {
		return new ResponseEntity<>(caseStudyService.searchAvailproductbyseller(), HttpStatus.OK);
	}
}
