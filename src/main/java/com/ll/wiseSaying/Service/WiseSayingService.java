package com.ll.wiseSaying.Service;

import com.ll.Rq;
import com.ll.wiseSaying.entity.WiseSaying;
import com.ll.wiseSaying.repository.WiseSayingRepository;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    private final WiseSayingRepository wiseSayingRepository;


    public WiseSayingService() {
        wiseSayingRepository = new WiseSayingRepository();
    }

    public List<WiseSaying> findAll() {
        return wiseSayingRepository.findAll();
    }

    public WiseSaying findById(long id) {
        return wiseSayingRepository.findById(id);
    }

    public long write(String content, String author) {
        return wiseSayingRepository.write(content, author);
    }

    public void remove(WiseSaying wiseSaying) {
        wiseSayingRepository.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String content, String author) {
        wiseSayingRepository.modify(wiseSaying, content, author);
    }

}
