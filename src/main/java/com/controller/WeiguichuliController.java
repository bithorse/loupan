package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WeiguichuliEntity;
import com.entity.view.WeiguichuliView;

import com.service.WeiguichuliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 违规处理
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-09 16:01:54
 */
@RestController
@RequestMapping("/weiguichuli")
public class WeiguichuliController {
    @Autowired
    private WeiguichuliService weiguichuliService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeiguichuliEntity weiguichuli,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("tanzhu")) {
			weiguichuli.setTanzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shichangguanliyuan")) {
			weiguichuli.setGuanlizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WeiguichuliEntity> ew = new EntityWrapper<WeiguichuliEntity>();
		PageUtils page = weiguichuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weiguichuli), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeiguichuliEntity weiguichuli, 
		HttpServletRequest request){
        EntityWrapper<WeiguichuliEntity> ew = new EntityWrapper<WeiguichuliEntity>();
		PageUtils page = weiguichuliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weiguichuli), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeiguichuliEntity weiguichuli){
       	EntityWrapper<WeiguichuliEntity> ew = new EntityWrapper<WeiguichuliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weiguichuli, "weiguichuli")); 
        return R.ok().put("data", weiguichuliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeiguichuliEntity weiguichuli){
        EntityWrapper< WeiguichuliEntity> ew = new EntityWrapper< WeiguichuliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weiguichuli, "weiguichuli")); 
		WeiguichuliView weiguichuliView =  weiguichuliService.selectView(ew);
		return R.ok("查询违规处理成功").put("data", weiguichuliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeiguichuliEntity weiguichuli = weiguichuliService.selectById(id);
        return R.ok().put("data", weiguichuli);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeiguichuliEntity weiguichuli = weiguichuliService.selectById(id);
        return R.ok().put("data", weiguichuli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeiguichuliEntity weiguichuli, HttpServletRequest request){
    	weiguichuli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weiguichuli);
        weiguichuliService.insert(weiguichuli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WeiguichuliEntity weiguichuli, HttpServletRequest request){
    	weiguichuli.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weiguichuli);
        weiguichuliService.insert(weiguichuli);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WeiguichuliEntity weiguichuli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weiguichuli);
        weiguichuliService.updateById(weiguichuli);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weiguichuliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WeiguichuliEntity> wrapper = new EntityWrapper<WeiguichuliEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("tanzhu")) {
			wrapper.eq("tanzhuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shichangguanliyuan")) {
			wrapper.eq("guanlizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = weiguichuliService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
