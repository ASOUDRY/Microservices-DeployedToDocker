// package com.soudry.monsterProducer.controller;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.soudry.monsterProducer.entities.Monster;

// @RestController
// public class MonsterController {
// 	@GetMapping("/grabMonsters")
// 	public List<Monster> getMonster() {
// 		Monster goblin = new Monster("Goblin", 10, 15);
// 		Monster hobgoblin = new Monster("Hobgoblin", 10, 15);
// 		Monster BugBear = new Monster("Bugbear", 10, 15);
// 		List<Monster> list = new ArrayList<>();
// 		list.add(goblin);
// 		list.add(hobgoblin);
// 		list.add(BugBear);
// 		return list;
// 	}

// 	public List<Monster> circuitFailedMethod() {
// 		Monster fiend = new Monster("Archdevil;", 10, 15);
// 		List<Monster> monsterList =new ArrayList<Monster>();
// 		monsterList.add(fiend);
// 		return monsterList;
// 	}
// }
