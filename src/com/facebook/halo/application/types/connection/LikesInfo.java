package com.facebook.halo.application.types.connection;

import static com.facebook.halo.framework.formatter.DateUtils.toDateFromLongFormat;

import java.util.Date;
import com.facebook.halo.application.types.infra.CategorizedFacebookType;

/**
 * User Object Connection type
 * @author immk
 *
 */
public class LikesInfo extends CategorizedFacebookType{
	private String createdTime;

	public Date getCreatedTime() {
		return toDateFromLongFormat(createdTime);
	}

}
