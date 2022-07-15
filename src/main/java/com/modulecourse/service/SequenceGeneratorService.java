package com.modulecourse.service;

import com.modulecourse.entity.keyentity.KeySequence;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Getter
@Setter
@Service
public class SequenceGeneratorService {
//    @Autowired
//    public MongoOperations mongoOperations;
//
//    public long getSequence(String seqName){
//        Query query = new Query(Criteria.where("idName").is(seqName));  //Get the Seq number by filtering
//                                                                            //where idName=seqName in Key_Sequence Collection
//
//        Update  update = new Update().inc("seq",1);                 //Update the seq variable by 1
//
//        KeySequence counter = mongoOperations.findAndModify(query,update,KeySequence.class);
//        return !Objects.isNull(counter) ? counter.getSeq() : 1;
//    }
}
