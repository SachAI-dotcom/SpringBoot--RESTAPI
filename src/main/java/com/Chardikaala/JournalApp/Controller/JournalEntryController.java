package com.Chardikaala.JournalApp.Controller;

import com.Chardikaala.JournalApp.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Journal")
public class JournalEntryController {

   private Map<Long, JournalEntity> journalentries = new HashMap<>();
   @GetMapping
   public ArrayList<JournalEntity> getAll(){
       return  new ArrayList<>(journalentries.values());

   }
   @PostMapping
    public  boolean  create(@RequestBody JournalEntity myentry){
            journalentries.put(myentry.getId(),myentry);
            return  true;
   }

   @GetMapping("id/{myid}")
    public  JournalEntity getentinty(@PathVariable long myid){
       return journalentries.get(myid);
   }

   @DeleteMapping("id/{myid}")

    public JournalEntity removeentity(@PathVariable long myid){
       return journalentries.remove(myid);
   }

    public JournalEntity removeentity(@PathVariable long myid, @RequestBody JournalEntity myentry){
        return journalentries.put(myid,myentry);
    }
}
