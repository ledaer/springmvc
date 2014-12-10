package com.leying.system.basic.dao.intf;

import com.leying.system.basic.model.po.MAdmin;

public interface AdminDAO {

	MAdmin read(String username);

	MAdmin read(int id);

	Boolean save(MAdmin madmin);
}
