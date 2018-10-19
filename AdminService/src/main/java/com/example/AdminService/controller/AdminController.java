package com.example.AdminService.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.AdminService.dao.CandidatePersonalDAO;
import com.example.AdminService.dao.CompanyMasterDAO;
import com.example.AdminService.dao.PlacedCandidateDAO;
import com.example.AdminService.entities.CandidatePersonal;
import com.example.AdminService.entities.CompanyMaster;
import com.example.AdminService.entities.PlacedCandidate;
import com.example.AdminService.exception.RecruitmentException;


//this is a controller class
@RestController
public class AdminController {

	@Autowired
	CandidatePersonalDAO candidatePersonalDao;


	@Autowired
	PlacedCandidateDAO placedCandidatesDao;

	@Autowired
	CompanyMasterDAO companyMasterDao;
	
	
	//This is the logger
	Logger daoLogger=null;
	
	public AdminController() {
		daoLogger=Logger.getLogger(AdminController.class);
		PropertyConfigurator.configure("D:/Santhosh Padakanti/Santhosh/AdminService/log4j.properties");
	}
	
	//Retrieval of placed candidate based on month
	@GetMapping("/placedmonth/{month}")
	public ArrayList<String> placedCountMonth(@PathVariable("month") String month) throws RecruitmentException {
		List<PlacedCandidate> placedCandidateList=placedCandidatesDao.findAll();
		List<CandidatePersonal>  candidateList=candidatePersonalDao.findAll();
		ArrayList<String> placedNames=new ArrayList<>();
		for(PlacedCandidate placedCandidate:placedCandidateList)
		{
			if(month.equalsIgnoreCase(placedCandidate.getMonth()))
			{
				for(CandidatePersonal candidate:candidateList)
				{
					if(candidate.getCandidateId().equals(placedCandidate.getCandidateId()))
					{
						placedNames.add(candidate.getCandidateName());
					}
				}
			}
		}
		daoLogger.info("Successfully retrieved data with the month "+month);
		return placedNames;
	}
	
	//Retrieval of placed candidate based on company
	@GetMapping("/placedcompany/{company}")
	public ArrayList<String> placedCountCompany(@PathVariable("company") String company) throws RecruitmentException {
		List<PlacedCandidate> placedCandidateList=placedCandidatesDao.findAll();
		List<CandidatePersonal>  candidateList=candidatePersonalDao.findAll();
		List<CompanyMaster> companyList=companyMasterDao.findAll();
		
		ArrayList<String> placedNames=new ArrayList<>();
		for(CompanyMaster companySearch:companyList)
		{
			String companyId;
			if(companySearch.getCompanyName().equalsIgnoreCase(company))
			{
				companyId=companySearch.getCompanyId();
				for(PlacedCandidate placedCandidate:placedCandidateList)
				{
					//here
					if(companyId.equals(placedCandidate.getCompanyId()))
					{
						for(CandidatePersonal candidate:candidateList)
						{
							if(candidate.getCandidateId().equals(placedCandidate.getCandidateId()))
							{
								placedNames.add(candidate.getCandidateName());
							}
						}

					}


				}
			}
		}
		daoLogger.info("Successfully retrieved placed names in company with name "+company);

		return placedNames;
	}
	
	//Retrieval of placed candidate based on designation
	@GetMapping("/placeddesignation/{designation}")
    public ArrayList<String> pCountDesignation(@PathVariable("designation") String designation)
            throws RecruitmentException {

        List<PlacedCandidate> placedCandidateList=placedCandidatesDao.findAll();
        ArrayList<String> placedCandidatesName=new ArrayList<>();
        List<CandidatePersonal>  candidateList=candidatePersonalDao.findAll();
        for(PlacedCandidate placedCandidate:placedCandidateList)
        {
            String candidateId;
            if(placedCandidate.getDesignation().equalsIgnoreCase(designation))
            {
                candidateId=placedCandidate.getCandidateId();
                for(CandidatePersonal candidate:candidateList)
                {
                    if(candidate.getCandidateId().equals(candidateId))
                    {
                        placedCandidatesName.add(candidate.getCandidateName());
                    }
                }
            }
        }
		daoLogger.info("Successfully retrieved data "+designation);

        return placedCandidatesName;
    }

}
