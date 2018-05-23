/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package cn.ranto.modules.test.cotroller;

import cn.ranto.common.annotation.SysLog;
import cn.ranto.common.utils.PageUtils;
import cn.ranto.common.utils.R;
import cn.ranto.common.validator.ValidatorUtils;
import cn.ranto.modules.job.entity.ScheduleJobEntity;
import cn.ranto.modules.job.service.ScheduleJobService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.2.0 2016-11-28
 */
@RestController
@RequestMapping("/test/html")
public class HtmlController {
	/**
	 * 定时任务列表
	 */
	@RequestMapping("/one")
	public R list(@RequestParam Map<String, Object> params){

		return R.ok();
	}
}
