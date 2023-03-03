package com.ll.wiseSaying.Service;

import com.ll.Rq;
import com.ll.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    private long lastWiseId;
    private List<WiseSaying> wiseSayings;

    public WiseSayingService() {
        wiseSayings = new ArrayList<>();
        lastWiseId = 0;
    }

    public WiseSaying findById(long id) {
        for (WiseSaying wiseSaying : wiseSayings) {
            if (wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }

        return null;
    }

    public List<WiseSaying> findAll() {
        return wiseSayings;
    }

    public long write(String content, String author) {
        long id = lastWiseId + 1;

        WiseSaying wiseSaying = new WiseSaying(id, content, author);
        wiseSayings.add(wiseSaying);

        lastWiseId = id; // 방금 새 명언이 생성되었으니, lastWiseId 값을 갱신한다

        return id;
    }

    public void remove(WiseSaying wiseSaying) {
        wiseSayings.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String content, String author) {
        wiseSaying.setAuthor(author);
        wiseSaying.setContent(content);
    }
}
