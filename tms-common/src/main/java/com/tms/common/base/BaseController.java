package com.tms.common.base;

import lombok.extern.slf4j.Slf4j;
import com.tms.common.message.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-12 18:58
 **/
@Slf4j
public abstract class BaseController<Bs extends BaseService, M extends BaseModel> {

    @Autowired
    protected Bs baseService;

    @PostMapping
    public DataResponse<M> add(@RequestBody M entity){
        baseService.insert(entity);
        return new DataResponse<>();
    }
    @GetMapping("/{id}")
    public DataResponse<M> get(@PathVariable String id){
        Object o = baseService.selectById(id);
        DataResponse<M> objectResponse = new DataResponse<>();
        if (o!=null){
            objectResponse.setData((M) o);

        }
        return objectResponse;
    }

    @PutMapping
    public DataResponse<M> update(M entity){
        baseService.updateById(entity);
        return new DataResponse<>();
    }

    @DeleteMapping("/{id}")
    public DataResponse<M> delete(@PathVariable String id){
        baseService.deleteById(id);
        return new DataResponse<>();
    }


}
