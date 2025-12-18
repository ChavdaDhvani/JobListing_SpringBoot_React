import axios from "axios";

const API = "http://localhost:8080";

export const fetchPosts = () => axios.get(`${API}/posts`);

export const searchPosts = (text) =>
  axios.get(`${API}/posts/${text}`);

export const createPost = (post) =>
  axios.post(`${API}/post`, post);
