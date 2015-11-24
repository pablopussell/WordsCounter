import static spark.Spark.*;

import freemarker.template.Configuration;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;



public class App {

	public static void main(String[] args) {
			staticFileLocation("/resources");
			
			FreeMarkerEngine freeMarkerEngine = createTemplateEngine();
			
			get("/", (req, res) -> {
				res.redirect("/words", 301);
				return "Redirecting to /words...";
			});
			
			WordsController wordsController = new WordsController(freeMarkerEngine);
			
	}
	
	private static FreeMarkerEngine createTemplateEngine() {
		FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine();
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(App.class, "/resources");
		freeMarkerEngine.setConfiguration(configuration);
		return freeMarkerEngine;
	}

}
