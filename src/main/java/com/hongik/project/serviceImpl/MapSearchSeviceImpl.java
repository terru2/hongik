package com.hongik.project.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongik.project.dao.MapSearchDAO;
import com.hongik.project.service.MapSearchSevice;
import com.hongik.project.vo.CategoryVO;
import com.hongik.project.vo.CityVO;
import com.hongik.project.vo.MapDataVO;
import com.hongik.project.vo.UpdateVO;

@Service
public class MapSearchSeviceImpl implements MapSearchSevice {

	@Autowired
	MapSearchDAO dao;
	
	

	public ArrayList<CategoryVO> getCategory1() {
		return dao.getCategory1();
	}

	public ArrayList<MapDataVO> getSearchMapData(String category1) {
		return dao.getSearchMapData(category1);
	}

	public void insertTempMapData(MapDataVO vo) {
		dao.insertTempMapData(vo);
	}

	public ArrayList<MapDataVO> getTempMapData(String id) {
		return dao.getTempMapData(id);
	}

	public void deleteMapData(String name) {
		dao.deleteMapData(name);
	}

	public void deleteMainMapData(String name) {
		dao.deleteMainMapData(name);
	}
	/* ================================================ 설계 오류로 인해 처음부터 다시 하는중 ============================================= */
	public ArrayList<CityVO> getcity() {
		return dao.getcity();
	}
	
	public ArrayList<CityVO> gettownship(String city) {
		return dao.gettownship(city);
	}
	
	public ArrayList<CityVO> getFocusXY(String township) {
		return dao.getFocusXY(township);
	}

	public ArrayList<MapDataVO> getAlldate(UpdateVO vo) {
		return dao.getAlldate(vo);
	}
	public void UpdateXY(ArrayList<UpdateVO> updatelist) {
		dao.UpdateXY(updatelist);
	}
	public void UpdateCityTown(ArrayList<UpdateVO> updatelist) {
		dao.UpdateCityTown(updatelist);
	}

	public ArrayList<MapDataVO> getAllMapdate() {
		return dao.getAllMapdate();
	}

}
