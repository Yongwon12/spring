package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.model.aws.dao.BoardWriteInfoDao;
import com.example.demo.model.aws.vo.BoardWriteInfoEntity;
import com.example.demo.model.aws.vo.BoardWriteInfoRepository;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/board")
@Controller
public class BoardController {


    @Autowired
    private BoardWriteInfoDao boardWriteInfoDao;


    @GetMapping("/boardwrite1")
    public @ResponseBody Map<String, Object> boards1() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard1();

        rtnObj.put("boardwrite1", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite2")
    public @ResponseBody Map<String, Object> boards2() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard2();

        rtnObj.put("boardwrite2", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite3")
    public @ResponseBody Map<String, Object> boards3() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard3();

        rtnObj.put("boardwrite3", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite4")
    public @ResponseBody Map<String, Object> boards4() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard4();

        rtnObj.put("boardwrite4", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite5")
    public @ResponseBody Map<String, Object> boards5() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard5();

        rtnObj.put("boardwrite5", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite6")
    public @ResponseBody Map<String, Object> boards6() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard6();

        rtnObj.put("boardwrite6", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite7")
    public @ResponseBody Map<String, Object> boards7() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard7();

        rtnObj.put("boardwrite7", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite8")
    public @ResponseBody Map<String, Object> boards8() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard8();

        rtnObj.put("boardwrite8", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite9")
    public @ResponseBody Map<String, Object> boards9() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard9();

        rtnObj.put("boardwrite9", newsList);
        return rtnObj;
    }

    @GetMapping("/boardwrite10")
    public @ResponseBody Map<String, Object> boards10() throws Exception {

        Map<String, Object> rtnObj = new HashMap<>();

        List<BoardWriteInfoEntity> newsList = boardWriteInfoDao.listBoard10();

        rtnObj.put("boardwrite10", newsList);
        return rtnObj;
    }



}