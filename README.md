important annotation
========================
@Controller  (web application)
@RestController (rest application)

//common annotation for both application

//registering user defined class to spring framework
@Repositories
@Service
@Component
@Bean

//url maping to controller method

@RequestMapping(value="api/{username}",method=RequestMethod.GET)

//creating object via factory method using framework
@Autowired
@Qualifier (when ambiguity )
@Primary (when 1 implementation class need to set default)

//request/submit for object while hiting url
@RequestBody
@ResponseBody

//url value reading
@Param
@PathVariable
