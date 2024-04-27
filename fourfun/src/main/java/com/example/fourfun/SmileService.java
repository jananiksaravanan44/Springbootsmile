package com.example.fourfun;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SmileService {
    @Autowired
    private SmileRepo jr;
    
    public Smile create(Smile j)
    {
       
        return jr.save(j);
    }
    public Smile getbyid(int jobId)
    {
        return jr.findById(jobId).orElse(null);
    }


    public List<Smile> getAllJob()
    {
        return jr.findAll();
    }
    public boolean updateDetails(int jobId,Smile p)
        {
            if(jr.findById(jobId)==null)
            {
                return false;
            }
            try{
                jr.save(p);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
        public boolean deleteJob(int jobId)
        {
            if(this.getbyid(jobId) == null)
            {
                return false;
            }
            jr.deleteById(jobId);
            return true;
        }

        


       
}