package com.fc.test.controller.admin.mapController;

import com.alibaba.fastjson.annotation.JSONField;
import com.fc.test.common.base.BaseController;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.model.mapModel.heatMapPoint;
import com.fc.test.model.mapModel.mapModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;

import java.util.*;

@Controller
@RequestMapping("/mapController")
public class mapControllerMain extends BaseController {
    //private String prefix = "admin/baidumap";


    @GetMapping("view")
    public String mapMain(Model model) {
        System.out.println("mapController");
        setTitle(model, new TitleVo("Map", "map", true, "welcome to map", false, false));
        return "admin/baidumap";
    }

    @GetMapping("/getPoint")
    @ResponseBody
    public List<mapModel> get_point(Model model) {
        List<mapModel> list = new ArrayList();
        list.add(new mapModel(116.3651989838867, 39.916527000000066, "ppp1", "11", Math.round((float) Math.random())));
        list.add(new mapModel(116.40639771435545, 39.898882172515286, "ppp2", "22", Math.round((float) Math.random())));
        list.add(new mapModel(116.4105720000, 39.9176140000, "ppp3", "33", Math.round((float) Math.random())));
        list.add(new mapModel(116.3903070000, 39.9202150000, "ppp4", "44", Math.round((float) Math.random())));
        list.add(new mapModel(116.4062610000, 39.9247520000, "ppp5", "55", Math.round((float) Math.random())));
        //System.out.println(list);
        return list;
    }

    @GetMapping("/getPointUpdate")
    @ResponseBody
    public List<mapModel> get_point_update(Model model) {
        //System.out.println(11);
        List<mapModel> list = new ArrayList();
        list.add(new mapModel(116.4062610000, 39.9247520000, "ppp5", "" + (int) (Math.random() * 100), Math.round((float) Math.random())));
        list.add(new mapModel(116.3903070000, 39.9202150000, "ppp4", "" + (int) (Math.random() * 100), Math.round((float) Math.random())));


        //System.out.println(list);
        return list;
    }


    @GetMapping("/getHeatMapPoint")
    @ResponseBody
    public List<heatMapPoint> get_heat_map_point(Model model) {
        Map<String, Double> heatMapConfig = new HashMap<String, Double>();
        //112.625781,38.453245
        heatMapConfig.put("sw_lng", 112.625781);
        heatMapConfig.put("sw_lat", 38.453245);
        //112.768935,38.507703
        heatMapConfig.put("ne_lng", 112.768935);
        heatMapConfig.put("ne_lat", 38.507703);
        heatMapConfig.put("lngSPen", Math.abs(heatMapConfig.get("sw_lng") - heatMapConfig.get("ne_lng")));
        heatMapConfig.put("latSPen", Math.abs(heatMapConfig.get("sw_lat") - heatMapConfig.get("ne_lat")));

        List<heatMapPoint> heatMapPoints = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            heatMapPoints.add(new heatMapPoint(
                    heatMapConfig.get("sw_lng") + heatMapConfig.get("lngSPen") * (Math.random() * 5),
                    heatMapConfig.get("ne_lat") - heatMapConfig.get("latSPen") * (Math.random() * 5),
                    (float) Math.random() * 20 + (float) 20.0));
        }
        System.out.println(heatMapPoints);
        return heatMapPoints;
    }

}
