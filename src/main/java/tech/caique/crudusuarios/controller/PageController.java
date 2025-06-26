package tech.caique.crudusuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tech.caique.crudusuarios.model.User;
import tech.caique.crudusuarios.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class PageController {

    @Autowired
    private UserRepository userRepository;

    // realiza a leitura dos dados salvos no banco e exibi na tela
    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }

    // Novo usuário
    @GetMapping("/new")
    public String novoUsuario(Model model) {
        model.addAttribute("user", new User());
        return "user_form";
    }

    // Editar usuário
    @GetMapping("/edit/{id}")
    public String editarUsuario(@PathVariable Long id, Model model) {
        User user = userRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("user", user);
        return "user_edit"; // 👈 novo HTML específico para edição
    }


    // Salvar (tanto para novos usuários, quanto pra edição)
    @PostMapping
    public String salvarUsuario(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/users";
    }

    // Exclusão dos usuários
    @PostMapping("/delete/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/users";
    }
}