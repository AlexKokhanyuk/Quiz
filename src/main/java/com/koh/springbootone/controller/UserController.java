package com.koh.springbootone.controller;

import com.koh.springbootone.model.Quiz;
import com.koh.springbootone.model.User;
import com.koh.springbootone.service.QuestionServise;
import com.koh.springbootone.service.QuizServise;
import com.koh.springbootone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;
    private QuizServise quizService;
    private QuestionServise questionService;

    @Autowired
    public UserController(UserService userService, QuizServise quizService, QuestionServise questionService) {
        this.userService = userService;
        this.quizService = quizService;

        this.questionService = questionService;
    }

    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user) {
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "user-update";
    }

    @PostMapping("/user-update")
    public String updateUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/quiz")
    public String findAllQuiz(Model model) {
        List<Quiz> quiz = quizService.findAll();
        model.addAttribute("quiz", quiz);

        return "quiz";
    }

    @GetMapping("/select-quiz/{id}")
    public String selectQuiz(@PathVariable("id") Long id, Model model) {
        Quiz quiz = quizService.findById(id);
        model.addAttribute("quiz", quiz);
        return "select-quiz";
    }
    @GetMapping("/pass-quiz/{id}")
    public String passQuiz(@PathVariable("id") Long id, Model model) {
        Quiz quiz = quizService.findById(id);
        model.addAttribute("quiz", quiz);

        return "pass-quiz";
    }

    @GetMapping("/quiz-create")
    public String createQuizForm(User user) {
        return "user-create";
    }

}

