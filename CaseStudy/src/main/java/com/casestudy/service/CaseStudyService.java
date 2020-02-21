package com.casestudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.repository.CaseStudyRepository;

@Service
public class CaseStudyService {

	@Autowired
	private CaseStudyRepository nocRepository;

	public Object searchBrand() {
		return nocRepository.searchBrand();
	}

	public Object searchPrice() {
		return nocRepository.searchPrice();
	}

	public Object searchColor() {
		return nocRepository.searchColor();
	}

	public Object searchSize() {
		return nocRepository.searchSize();
	}

	public Object searchSku() {
		return nocRepository.searchSku();
	}

	public Object searchAvailproductbyseller() {
		return nocRepository.searchAvailproductbyseller();
	}

}
