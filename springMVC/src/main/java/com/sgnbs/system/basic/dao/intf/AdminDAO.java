package com.sgnbs.system.basic.dao.intf;

import com.sgnbs.system.basic.model.po.MAdmin;

public interface AdminDAO {

	MAdmin read(String username);

	MAdmin read(int id);

	Boolean save(MAdmin madmin);
}
