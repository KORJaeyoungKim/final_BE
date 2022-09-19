package com.hanghae.mungnayng.controller;


import com.hanghae.mungnayng.domain.Room.RoomDetail;
import com.hanghae.mungnayng.domain.Room.RoomInfo;
import com.hanghae.mungnayng.domain.UserDetailsImpl;
import com.hanghae.mungnayng.domain.chat.dto.ChatDto;
import com.hanghae.mungnayng.domain.member.Member;
import com.hanghae.mungnayng.repository.RoomDetailRepository;
import com.hanghae.mungnayng.repository.RoomInfoRepository;
import com.hanghae.mungnayng.service.ChatService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@AllArgsConstructor
public class ChatController {
    private final RoomInfoRepository roomInfoRepository;
    private final RoomDetailRepository roomDetailRepository;
    private final ChatService chatService;
    /*채팅방과 연결*/
    @GetMapping("/room/{itemId}")
    public ResponseEntity<?> getRoomChat(@AuthenticationPrincipal UserDetailsImpl userDetails,
                                         @PathVariable Long itemId) {
        RoomInfo roomInfo = roomInfoRepository.findRoomInfoByItem_Id(itemId)
                .orElseThrow(()-> new IllegalArgumentException("채팅방이 없어요!"));
        Member member = userDetails.getMember();
        RoomDetail roomDetail = roomDetailRepository.findByMemberMemberId(member.getMemberId())
                .orElseThrow(()-> new IllegalArgumentException("채팅 내역이 없습니다"));
        log.info(member.getMemberId());
    List<ChatDto> chats = chatService.getChat(member, roomInfo);
        return ResponseEntity.ok().body(chats);
    }
}

//    @GetMapping("/chat")
//    public String chatGET(){
//
//        log.info("@ChatController, chat GET()");
//
//        return "chat";
//    }