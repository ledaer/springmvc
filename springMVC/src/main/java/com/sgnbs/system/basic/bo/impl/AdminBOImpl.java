package com.sgnbs.system.basic.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sgnbs.system.basic.bo.intf.AdminBO;
import com.sgnbs.system.basic.dao.intf.AdminDAO;
import com.sgnbs.system.basic.model.pagebean.AdminBean;
import com.sgnbs.system.basic.model.po.MAdmin;

@Service
@Transactional
public class AdminBOImpl implements AdminBO{
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public boolean QueryPurview(AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false; 
	}

	@Override
	public boolean addInit(AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MAdmin getAdmin(MAdmin admin) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean addValid(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addValidSP(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return adminDAO.save(admin);
	}

	@Override
	public boolean addSubmitSP(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	@Override
	public boolean modInit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modValid(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modSubmitByCorp(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean statusInit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean statusSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelInit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passwordInit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passwordSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean selfPasswordSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteInit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loginValid(MAdmin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int modPasswordInterval(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MAdmin modInFoValid(MAdmin admin) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modInFoSubmit(MAdmin admin, AdminBean adminBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getPasswordValid(MAdmin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getPasswordSubmit(MAdmin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modCorpAdmin(MAdmin admin, AdminBean adminBean,
			String modType) {
		// TODO Auto-generated method stub
		return false;
	}
	**/

}
