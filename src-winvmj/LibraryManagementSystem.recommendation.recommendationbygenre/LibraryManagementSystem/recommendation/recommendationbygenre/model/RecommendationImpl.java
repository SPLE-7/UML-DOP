package LibraryManagementSystem.recommendation.recommendationbygenre;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import LibraryManagementSystem.recommendation.core.RecommendationDecorator;
import LibraryManagementSystem.recommendation.core.Recommendation;
import LibraryManagementSystem.recommendation.core.RecommendationComponent;

@Entity(name="recommendation_recommendationbygenre")
@Table(name="recommendation_recommendationbygenre")
public class RecommendationImpl extends RecommendationDecorator {

	public RecommendationImpl(
        super();
        this.objectName = RecommendationImpl.class.getName();
    }
    
    public RecommendationImpl() {
    	super();
		this.objectName = RecommendationImpl.class.getName();
    }
	
	public RecommendationImpl(RecommendationComponent record, ) {
		super(record);
		this.objectName = RecommendationImpl.class.getName();
	}


	public List<DaftarBuku> generateRecommendationGenre() {
		// TODO: implement this method
	}

}
