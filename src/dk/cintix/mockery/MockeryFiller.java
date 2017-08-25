package dk.cintix.mockery;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dk.cintix.mockery.paqle.mock.Kandidate;
import dk.cintix.mockery.paqle.mock.KandidateAnswer;
import dk.cintix.mockery.paqle.mock.KandidateList;
import dk.cintix.mockery.paqle.mock.KandidateMetadata;
import dk.cintix.mockery.paqle.mock.KandidateResponse;
import dk.cintix.mockery.paqle.mock.KandidateResponses;
import dk.cintix.mockery.paqle.mock.KandidateType;
import dk.cintix.mockery.paqle.mock.Name;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author migo
 */
public class MockeryFiller {
    private final int[] kandiateOptions = {-2,-1,0,1,2};
    public MockeryFiller() {
    }

    public static void main(String[] args) {
        new MockeryFiller().mockPaqle();
    }

    public void mockPaqle() {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        Gson gson = builder.create();

        KandidateList kandidateList = new KandidateList();
        List<Kandidate> kandidates = new ArrayList<>();

        KandidateResponses responses = new KandidateResponses();
        List<KandidateResponse> kandidateResponses = new ArrayList<>();

        int lastId = 0;
        int questionSequenceNr = 1;
        for (int id = 1; id < 100; id++) {

            Name name = new Name("Person " + id + " Name");
            List<Name> names = new ArrayList<>();
            names.add(name);

            KandidateMetadata kandidateMetadata = new KandidateMetadata();
            kandidateMetadata.setNames(names);

            Kandidate kandidate = new Kandidate();
            kandidate.setMetadata(kandidateMetadata);
            kandidate.setPublished(true);
            kandidate.setId(id);
            kandidate.setVersion((int) (Math.random() * 45));
            kandidates.add(kandidate);
            lastId = id;

            KandidateResponse kandidateResponse = new KandidateResponse();
            List<KandidateAnswer> answers = new ArrayList<>();

            kandidateResponse.setId(id);
            int kandidateType = (int) (Math.random() * 2);

            if (kandidateType == 0 || kandidateType == 1) {
                kandidateResponse.setQuestionnaire(KandidateType.KOMMUNE);
            } else {
                kandidateResponse.setQuestionnaire(KandidateType.REGION);
            }

            for (int questionId = 1; questionId < 12; questionId++) {
                KandidateAnswer answer = new KandidateAnswer();
                answer.setComments("No comments");
                answer.setOption(kandiateOptions[(int) (Math.random() * kandiateOptions.length)]);
                answer.setId(questionSequenceNr);
                questionSequenceNr++;
                answers.add(answer);
            }
            kandidateResponse.setAnswers(answers);
            kandidateResponses.add(kandidateResponse);
        }

        kandidateList.setKandidates(kandidates);
        kandidateList.setNextPageId(lastId);
        System.out.println(gson.toJson(kandidateList));

        
        System.out.println();
        System.out.println();
        
        responses.setNextPageId(2);
        responses.setResponses(kandidateResponses);
        System.out.println(gson.toJson(responses));
        

    }

}
