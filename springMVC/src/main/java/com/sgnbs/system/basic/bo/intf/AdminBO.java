package com.sgnbs.system.basic.bo.intf;

import java.util.List;

import com.sgnbs.system.basic.model.pagebean.AdminBean;
import com.sgnbs.system.basic.model.po.MAdmin;

public interface AdminBO {

	/**
	 * 效验是否可以查询联系人
	 * 
	 * @return
	 */
	public boolean QueryPurview(AdminBean adminBean) ;

	/**
	 * 效验是否可以新增联系人
	 * 
	 * @return
	 */

	public boolean addInit(AdminBean adminBean) ;

	/**
	 * 返回校验信息
	 * 
	 * @return
	 */
	public String getMessage();

	/**
	 * 获得管理员信息
	 * 
	 * @param MAdmin取其中的主键admin
	 * @return MAdmin
	 * @
	 */
	public MAdmin getAdmin(MAdmin admin) ;



	/**
	 * 增加管理员
	 * 
	 * @param admin
	 * @param adminBean
	 * @return
	 */
	public boolean addValid(MAdmin admin, AdminBean adminBean)
			;

	/**
	 * 增加联系人
	 * 
	 * @param admin
	 * @param adminBean
	 * @return
	 */
	public boolean addValidSP(MAdmin admin, AdminBean adminBean)
			;

	/**
	 * 增加管理员
	 * 
	 * @param admin
	 * @param adminBean
	 */
	public boolean addSubmit(MAdmin admin, AdminBean adminBean)
			;

	/**
	 * 增加联系人
	 * 
	 * @param admin
	 * @param adminBean
	 */
	public boolean addSubmitSP(MAdmin admin, AdminBean adminBean)
			;
/**

	public boolean modInit(MAdmin admin, AdminBean adminBean)
			;


	public boolean modValid(MAdmin admin, AdminBean adminBean)
			;


	public boolean modSubmit(MAdmin admin, AdminBean adminBean)
			;


	public boolean modSubmitByCorp(MAdmin admin, AdminBean adminBean)
			;


	public boolean statusInit(MAdmin admin, AdminBean adminBean)
			;


	public boolean statusSubmit(MAdmin admin, AdminBean adminBean)
			;


	public boolean cancelInit(MAdmin admin, AdminBean adminBean)
			;


	public boolean cancelSubmit(MAdmin admin, AdminBean adminBean)
			;


	public boolean passwordInit(MAdmin admin, AdminBean adminBean)
			;


	public boolean passwordSubmit(MAdmin admin, AdminBean adminBean)
			;


	public boolean selfPasswordSubmit(MAdmin admin, AdminBean adminBean)
			;


	public boolean deleteInit(MAdmin admin, AdminBean adminBean)
			;


	public boolean deleteSubmit(MAdmin admin, AdminBean adminBean)
			;


	public boolean loginValid(MAdmin admin) ;


	public int modPasswordInterval(MAdmin admin, AdminBean adminBean)
			;


	public MAdmin modInFoValid(MAdmin admin) throws Exception;

	public boolean modInFoSubmit(MAdmin admin, AdminBean adminBean)
			;


	public boolean getPasswordValid(MAdmin admin) ;


	public boolean getPasswordSubmit(MAdmin admin) ;


	public boolean modCorpAdmin(MAdmin admin, AdminBean adminBean,
			String modType) ;
	**/
}
