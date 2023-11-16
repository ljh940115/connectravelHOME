package com.connectravel.controller.chat;

import com.connectravel.domain.entity.Crew;
import com.connectravel.domain.entity.chat.ChatRoom;
import com.connectravel.dto.chat.ChatRoomDTO;
import com.connectravel.exception.AppException;
import com.connectravel.exception.ErrorCode;
import com.connectravel.repository.CrewRepository;
import com.connectravel.repository.MemberRepository;
import com.connectravel.repository.ParticipationRepository;
import com.connectravel.repository.chat.ChatRoomRepository;
import com.connectravel.service.ChatRoomService;
import com.connectravel.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/view/v1")
@Log4j2
public class RoomController {
    private final ChatRoomRepository chatRoomRepository;
    private final CrewRepository crewRepository;
    private final MemberRepository userRepository;
    private final ParticipationRepository participationRepository;

    private final ChatRoomService chatRoomService;
    private final ChatService chatService;

//    @Value("${aws.access.key}")
//    String AWS_ACCESS_KEY;
//
//    @Value("${aws.secret.access.key}")
//    String AWS_SECRET_ACCESS_KEY;
//
//    @Value("${aws.region}")
//    String AWS_REGION;
//
//    @Value("${aws.bucket.name}")
//    String AWS_BUCKET_NAME;
//
//    String AWS_BUCKET_DIRECTORY = "/crewimages";



    //채팅방 목록 조회
    @GetMapping(value = "/rooms")
    public String rooms(Model model, Authentication authentication){
        log.info("# All Chat Rooms");
        model.addAttribute("list",chatRoomService.findByParticipation(authentication.getName()));
        return "chat/rooms";
    }

    @GetMapping(value = "/roomsall")
    public String rooms(Model model){
        log.info("# All Chat Rooms");
        model.addAttribute("list",chatRoomService.findAllRooms());
        return "chat/rooms";
    }

    //채팅방 개설
    @PostMapping(value = "/room")
    public String create(@RequestParam ChatRoomDTO chatRoomDTO, RedirectAttributes rttr, Authentication authentication){
        log.info("# Create Chat Room , name: " + chatRoomDTO.getName());
        rttr.addFlashAttribute("roomName", chatRoomService.createChatRoomDTO(chatRoomDTO, authentication.getName()));
        return "redirect:/view/v1/rooms";
    }

    //채팅방 조회
    @GetMapping("/room")
    public String getRoom(Long roomId, Long crewId, Model model){

//        model.addAttribute("AWS_ACCESS_KEY", AWS_ACCESS_KEY);
//        model.addAttribute("AWS_SECRET_ACCESS_KEY", AWS_SECRET_ACCESS_KEY);
//        model.addAttribute("AWS_REGION", AWS_REGION);
//        model.addAttribute("AWS_BUCKET_NAME", AWS_BUCKET_NAME);
//        model.addAttribute("AWS_BUCKET_DIRECTORY", AWS_BUCKET_DIRECTORY);


        log.info("# get Chat Room, roomID : " + roomId);
        model.addAttribute("crewId",crewId);
        model.addAttribute("room", chatRoomService.findRoomById(roomId));

        Optional<ChatRoom> chatRoomOptional = chatRoomRepository.findByRoomId(roomId);
        if(chatRoomOptional.isEmpty()){
            throw new AppException(ErrorCode.DB_ERROR, ErrorCode.DB_ERROR.getMessage());
        }

        ChatRoom room = chatRoomOptional.get();

        Optional<Crew> crewOptional = crewRepository.findByChatRoom(room);

        if(crewOptional.isEmpty()){
            throw new AppException(ErrorCode.DB_ERROR, ErrorCode.DB_ERROR.getMessage());
        }

        Crew crew = crewOptional.get();

        model.addAttribute("crewImageKey", crew.getImagePath());
        return "chat/room";
    }


}