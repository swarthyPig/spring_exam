package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	// 테스트전 해당 번호 게시물 있는지 확인
	//private Long[] bnoArr = { 11460166L, 11460165L, 11460163L, 11460162L, 11460161L};

	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	@Test
	public void testList2() {
		Criteria cri = new Criteria(1, 10);
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 11460149L);
		
		replies.forEach(reply -> log.info(reply));
	}
	
	/*
	 * @Test public void testList() { Criteria cri = new Criteria();
	 * 
	 * //3145745L List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
	 * 
	 * replies.forEach(reply -> log.info(reply));
	 * 
	 * }
	 */
	
	/*
	 * @Test public void testUpdate() { Long targetRno = 10L;
	 * 
	 * ReplyVO vo = mapper.read(targetRno);
	 * 
	 * vo.setReply("update Reply ");
	 * 
	 * int count = mapper.update(vo);
	 * 
	 * log.info("UPDATE COUNT: " + count); }
	 */
	
	
	/*
	 * @Test public void testDelete() {
	 * 
	 * Long targetRno = 1L;
	 * 
	 * mapper.delete(targetRno); }
	 */
	 
	
	/*
	 * @Test public void testCreate() { IntStream.rangeClosed(1, 10).forEach(i -> {
	 * 
	 * ReplyVO vo = new ReplyVO();
	 * 
	 * //게시물의 번호 vo.setBno(bnoArr[i % 5]); // 1 2 3 4 0 1 2 3 4 0
	 * vo.setReply("댓글 테스트 " + i); vo.setReplyer("replyer" + i);
	 * 
	 * mapper.insert(vo); }); }
	 */
	
	/*
	 * @Test public void testRead() { Long targetRno = 5L;
	 * 
	 * ReplyVO vo = mapper.read(targetRno);
	 * 
	 * log.info(vo); }
	 */
	
	/*
	 * @Test public void testMapper() { log.info(mapper); }
	 */
}
